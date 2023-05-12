organization := "org.scalablytyped"
name := "yar"
version := "9.1-dt-20211202Z-caa55d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20221103Z-f8a1d6",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20211202Z-5a8f7b",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20230413Z-8dbd5c",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20211202Z-459190",
  "org.scalablytyped" %%% "joi" % "17.9.2-271199",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20211202Z-d3a3ff",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20211202Z-e1a947",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20211202Z-01fa34",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20211202Z-6526ab",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
