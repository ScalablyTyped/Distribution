organization := "org.scalablytyped"
name := "vitejs__plugin-react"
version := "2.2.0-acd97d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20220624Z-043aa4",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-bf895e",
  "org.scalablytyped" %%% "babel__parser" % "7.20.0-6157ab",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-1a1261",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-aa17f1",
  "org.scalablytyped" %%% "babel__types" % "7.20.0-d18d74",
  "org.scalablytyped" %%% "esbuild" % "0.15.12-df719c",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "postcss" % "8.4.18-a78a45",
  "org.scalablytyped" %%% "rollup" % "3.2.5-600601",
  "org.scalablytyped" %%% "source-map-js" % "1.0.2-fbe867",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "vite" % "3.2.0-84e937")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
