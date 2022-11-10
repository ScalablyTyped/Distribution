organization := "org.scalablytyped"
name := "yar"
version := "9.1-dt-20211202Z-17f4b4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20221103Z-559ca8",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20211202Z-48035d",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20221103Z-8629b9",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20211202Z-93d005",
  "org.scalablytyped" %%% "joi" % "17.7.0-d79f84",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20211202Z-937928",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20211202Z-b7301a",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20211202Z-e6f5b9",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20211202Z-fca171",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
