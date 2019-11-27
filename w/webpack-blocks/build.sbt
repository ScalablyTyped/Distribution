organization := "org.scalablytyped"
name := "webpack-blocks"
version := "2.0-dt-20191016Z-f70ee1"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-84e0a0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-08e889",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-67a687",
  "org.scalablytyped" %%% "source-map" % "0.7.3-651620",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-7c63f1",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-c659dd",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20191116Z-d0fa98",
  "org.scalablytyped" %%% "webpack-blocks__assets" % "2.0-dt-20191016Z-7d3057",
  "org.scalablytyped" %%% "webpack-blocks__babel" % "2.0-dt-20191016Z-e02259",
  "org.scalablytyped" %%% "webpack-blocks__core" % "2.0-dt-20191016Z-133d7f",
  "org.scalablytyped" %%% "webpack-blocks__dev-server" % "2.0-dt-20191016Z-c7f331",
  "org.scalablytyped" %%% "webpack-blocks__postcss" % "2.0-dt-20191016Z-de0aa4",
  "org.scalablytyped" %%% "webpack-blocks__sass" % "2.0-dt-20191016Z-db6a6b",
  "org.scalablytyped" %%% "webpack-blocks__typescript" % "2.0-dt-20191016Z-8be57b",
  "org.scalablytyped" %%% "webpack-blocks__uglify" % "2.0-dt-20191016Z-d44cad",
  "org.scalablytyped" %%% "webpack-blocks__webpack" % "2.0-dt-20191016Z-91864c",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-7974be")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        