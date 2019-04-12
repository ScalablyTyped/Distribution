organization := "org.scalablytyped"
name := "utility"
version := "1.16.1-854aba"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "escape-html" % "0.0-unknown-dt-20190322Z-616506",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-1134d6",
  "org.scalablytyped" %%% "mz" % "0.0-unknown-dt-20190322Z-384791",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        