organization := "org.scalablytyped"
name := "topojson"
version := "3.2-dt-20200515Z-fef86a"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20201002Z-fc1d16",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "topojson-client" % "3.0-dt-20180414Z-1474af",
  "org.scalablytyped" %%% "topojson-simplify" % "3.0-dt-20180414Z-5151fc",
  "org.scalablytyped" %%% "topojson-specification" % "1.0-dt-20190213Z-63b565")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
