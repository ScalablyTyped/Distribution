organization := "org.scalablytyped"
name := "webpack-blocks"
version := "2.0-dt-20191016Z-b93982"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-7f5e7d",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191022Z-f18ffd",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-df1e9f",
  "org.scalablytyped" %%% "source-map" % "0.7.3-54a40f",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-463316",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-2f0bcb",
  "org.scalablytyped" %%% "webpack" % "4.39-dt-20191021Z-824537",
  "org.scalablytyped" %%% "webpack-blocks__assets" % "2.0-dt-20191016Z-ae5044",
  "org.scalablytyped" %%% "webpack-blocks__babel" % "2.0-dt-20191016Z-9902ca",
  "org.scalablytyped" %%% "webpack-blocks__core" % "2.0-dt-20191016Z-ea8bf3",
  "org.scalablytyped" %%% "webpack-blocks__dev-server" % "2.0-dt-20191016Z-4e004b",
  "org.scalablytyped" %%% "webpack-blocks__postcss" % "2.0-dt-20191016Z-ae0354",
  "org.scalablytyped" %%% "webpack-blocks__sass" % "2.0-dt-20191016Z-43d373",
  "org.scalablytyped" %%% "webpack-blocks__typescript" % "2.0-dt-20191016Z-6bfdb3",
  "org.scalablytyped" %%% "webpack-blocks__uglify" % "2.0-dt-20191016Z-fb0640",
  "org.scalablytyped" %%% "webpack-blocks__webpack" % "2.0-dt-20191016Z-c472cc",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-9b93fa")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        