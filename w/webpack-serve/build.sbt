organization := "org.scalablytyped"
name := "webpack-serve"
version := "2.0-dt-20190212Z-a5dc47"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-1eaf82",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-e7b0ed",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-8e8c0f",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-34724c",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-e0ceed",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-561191",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20191101Z-51a4ff",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-215745",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20191016Z-c91c81",
  "org.scalablytyped" %%% "loglevel" % "1.6.4-135c7b",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20190322Z-f3d3b0",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-301fe0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191105Z-2397f3",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ebcbf",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-cc63ce",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-402452",
  "org.scalablytyped" %%% "source-map" % "0.7.3-00bd51",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-1ad099",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-391be5",
  "org.scalablytyped" %%% "webpack" % "4.39-dt-20191101Z-10ae88",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20190624Z-eaa2a6",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.0-dt-20180621Z-60df6a",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-dad00f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        