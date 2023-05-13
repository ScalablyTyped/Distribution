organization := "org.scalablytyped"
name := "vitejs__plugin-basic-ssl"
version := "1.0.1-ad4d9b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "esbuild" % "0.17.19-caf655",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "postcss" % "8.4.23-a62f41",
  "org.scalablytyped" %%% "rollup" % "3.21.6-dbf5a5",
  "org.scalablytyped" %%% "source-map-js" % "1.0.2-781ad1",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "vite" % "4.3.5-f5a6ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
