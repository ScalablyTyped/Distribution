organization := "org.scalablytyped"
name := "vitejs__plugin-react"
version := "2.2.0-85c911"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__core" % "7.20-dt-20230118Z-e25db7",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-589aa7",
  "org.scalablytyped" %%% "babel__parser" % "7.21.8-43580a",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-a71ff4",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20230426Z-96f2d9",
  "org.scalablytyped" %%% "babel__types" % "7.21.5-fbdd8a",
  "org.scalablytyped" %%% "esbuild" % "0.17.18-fcd351",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "postcss" % "8.4.23-a62f41",
  "org.scalablytyped" %%% "rollup" % "3.21.6-dbf5a5",
  "org.scalablytyped" %%% "source-map-js" % "1.0.2-781ad1",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "vite" % "4.3.5-3ba12d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
