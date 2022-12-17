organization := "org.scalablytyped"
name := "topojson"
version := "3.2-dt-20220624Z-64d13a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-89d05a",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "topojson-client" % "3.1-dt-20220330Z-1888c4",
  "org.scalablytyped" %%% "topojson-simplify" % "3.0-dt-20220624Z-cce8fc",
  "org.scalablytyped" %%% "topojson-specification" % "1.0-dt-20220624Z-9c5dff")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
