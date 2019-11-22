organization := "org.scalablytyped"
name := "webpack-blocks"
version := "2.0-dt-20191016Z-87b313"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-e7b0ed",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191119Z-94c257",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-402452",
  "org.scalablytyped" %%% "source-map" % "0.7.3-00bd51",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-1ad099",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-391be5",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20191116Z-037b04",
  "org.scalablytyped" %%% "webpack-blocks__assets" % "2.0-dt-20191016Z-9e2db9",
  "org.scalablytyped" %%% "webpack-blocks__babel" % "2.0-dt-20191016Z-cdf39f",
  "org.scalablytyped" %%% "webpack-blocks__core" % "2.0-dt-20191016Z-e8f8d3",
  "org.scalablytyped" %%% "webpack-blocks__dev-server" % "2.0-dt-20191016Z-c8cdbc",
  "org.scalablytyped" %%% "webpack-blocks__postcss" % "2.0-dt-20191016Z-428896",
  "org.scalablytyped" %%% "webpack-blocks__sass" % "2.0-dt-20191016Z-f06ac1",
  "org.scalablytyped" %%% "webpack-blocks__typescript" % "2.0-dt-20191016Z-0ca175",
  "org.scalablytyped" %%% "webpack-blocks__uglify" % "2.0-dt-20191016Z-8a687a",
  "org.scalablytyped" %%% "webpack-blocks__webpack" % "2.0-dt-20191016Z-55aa90",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-11f707")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        