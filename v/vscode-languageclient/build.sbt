organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "6.1.3-b91907"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "vscode" % "1.46-dt-20200611Z-337ba8",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "5.0.1-2e21e1",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.15.3-3143cc",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.15.1-f5391a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
