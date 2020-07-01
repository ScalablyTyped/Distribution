organization := "org.scalablytyped"
name := "wordpress__plugins"
version := "2.3-dt-20200611Z-f437e7"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-7dae47",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-034048",
  "org.scalablytyped" %%% "re-resizable" % "6.3.2-07c191",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200624Z-23874e",
  "org.scalablytyped" %%% "react-dom" % "16.9-dt-20200519Z-fa4a32",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "wordpress__components" % "9.0-dt-20200623Z-fe66f9",
  "org.scalablytyped" %%% "wordpress__element" % "2.15.0-5292b4",
  "org.scalablytyped" %%% "wordpress__notices" % "1.5-dt-20200515Z-6ca6b5",
  "org.scalablytyped" %%% "wordpress__rich-text" % "3.4-dt-20200515Z-072e89")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
