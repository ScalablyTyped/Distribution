organization := "org.scalablytyped"
name := "vscode-languageserver"
version := "6.1.1-59f78e"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "5.0.1-32d7f6",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.15.3-e46ee3",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.15.1-35a52e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
