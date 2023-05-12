organization := "org.scalablytyped"
name := "topojson"
version := "3.2-dt-20220624Z-4759ac"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-852eb7",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "topojson-client" % "3.1-dt-20220330Z-72bed5",
  "org.scalablytyped" %%% "topojson-simplify" % "3.0-dt-20220624Z-d49dd0",
  "org.scalablytyped" %%% "topojson-specification" % "1.0-dt-20220624Z-793424")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
