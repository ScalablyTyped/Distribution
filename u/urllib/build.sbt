organization := "org.scalablytyped"
name := "urllib"
version := "2.33.3-7976da"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "agent-base" % "4.2-dt-20180801Z-bf8e26",
  "org.scalablytyped" %%% "any-promise" % "1.3.0-526477",
  "org.scalablytyped" %%% "content-type" % "1.1-dt-20190212Z-d2b990",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-98f533",
  "org.scalablytyped" %%% "ee-first" % "1.1-dt-20181224Z-b1f11f",
  "org.scalablytyped" %%% "escape-html" % "0.0-unknown-dt-20190322Z-616506",
  "org.scalablytyped" %%% "http-proxy-agent" % "2.0-dt-20181017Z-89f9c7",
  "org.scalablytyped" %%% "humanize-ms" % "1.2-dt-20190305Z-e9bb14",
  "org.scalablytyped" %%% "iconv-lite" % "0.4.24-8ab6a7",
  "org.scalablytyped" %%% "ip" % "1.1-dt-20181231Z-1afb2f",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20190222Z-34c823",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-1134d6",
  "org.scalablytyped" %%% "mz" % "0.0-unknown-dt-20190322Z-384791",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "proxy-agent" % "3.1.0-5e8135",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180214Z-fdb770",
  "org.scalablytyped" %%% "qs" % "6.5-dt-20190409Z-e41135",
  "org.scalablytyped" %%% "statuses" % "1.5-dt-20181225Z-f5ea4d",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "utility" % "1.16.1-854aba")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        