organization := "org.scalablytyped"
name := "vega-typings"
version := "0.24.1-8c5ee4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20230419Z-b546e9",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-f1db3d",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2",
  "org.scalablytyped" %%% "vega-expression" % "5.1.0-747a54",
  "org.scalablytyped" %%% "vega-util" % "1.17.2-f08b2c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
