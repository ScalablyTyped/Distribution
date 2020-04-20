organization := "org.scalablytyped"
name := "twilio"
version := "2.11-dt-20200225Z-21fdb5"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-e204eb",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200226Z-677666",
  "org.scalablytyped" %%% "express" % "4.17-dt-20200409Z-704088",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200415Z-afdfd2",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-cd6086",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "q" % "1.5-dt-20200225Z-5715c4",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20200225Z-6c439e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-0a8d6e",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200227Z-c88828",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
