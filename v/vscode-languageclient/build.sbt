organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "6.1.3-86d4b9"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "vscode" % "1.51-dt-20201106Z-e33c30",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "5.0.1-3f7a97",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.15.3-09f514",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.15.1-20c2c8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
