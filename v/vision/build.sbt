organization := "com.scalablytyped"
name := "vision"
version := "5.3-dt-20181027Z-9ea4a1"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "boom" % "7.2-dt-20181120Z-57c4d8",
  "com.scalablytyped" %%% "catbox" % "10.0-dt-20181027Z-c5a6cc",
  "com.scalablytyped" %%% "hapi" % "17.6-dt-20181120Z-c8bf70",
  "com.scalablytyped" %%% "iron" % "5.0-dt-20180910Z-b7e3c1",
  "com.scalablytyped" %%% "joi" % "14.0-dt-20181031Z-8cc4e5",
  "com.scalablytyped" %%% "mime-db" % "1.27-dt-20180910Z-34fa5b",
  "com.scalablytyped" %%% "mimos" % "3.0-dt-20180910Z-e347b3",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-cadd20",
  "com.scalablytyped" %%% "podium" % "1.0-dt-20180910Z-db7ddc",
  "com.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-59ad3f",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        