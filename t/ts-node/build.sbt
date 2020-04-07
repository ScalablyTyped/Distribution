organization := "org.scalablytyped"
name := "ts-node"
version := "7.0.1-5efa45"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "make-error" % "1.3.6-b3c86e",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "typescript" % "3.8.3-07d300")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
