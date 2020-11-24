organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "6.1.3-23fe02"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "vscode" % "1.51-dt-20201106Z-fa8246",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "5.0.1-42d35b",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.15.3-40117f",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.15.1-444142")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
