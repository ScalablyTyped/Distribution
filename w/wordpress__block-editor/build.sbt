organization := "org.scalablytyped"
name := "wordpress__block-editor"
version := "2.2-dt-20200611Z-c8add8"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "3.0.2-b6fa26",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-64dc32",
  "org.scalablytyped" %%% "re-resizable" % "6.3.2-da56af",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200711Z-7368c8",
  "org.scalablytyped" %%% "react-dom" % "16.9-dt-20200519Z-1c567e",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "wordpress__blocks" % "6.4-dt-20200623Z-c53896",
  "org.scalablytyped" %%% "wordpress__components" % "9.0-dt-20200623Z-9c86fa",
  "org.scalablytyped" %%% "wordpress__element" % "2.16.0-35329a",
  "org.scalablytyped" %%% "wordpress__notices" % "1.5-dt-20200515Z-5c48e9",
  "org.scalablytyped" %%% "wordpress__rich-text" % "3.4-dt-20200515Z-c438cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
