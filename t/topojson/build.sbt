organization := "org.scalablytyped"
name := "topojson"
version := "3.2-dt-20200515Z-10b871"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20201002Z-2461bc",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "topojson-client" % "3.0-dt-20180414Z-cbe884",
  "org.scalablytyped" %%% "topojson-simplify" % "3.0-dt-20180414Z-6037b2",
  "org.scalablytyped" %%% "topojson-specification" % "1.0-dt-20190213Z-93861a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
