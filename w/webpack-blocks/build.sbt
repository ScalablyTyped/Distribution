organization := "org.scalablytyped"
name := "webpack-blocks"
version := "2.0-dt-20191016Z-3e3f12"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-d4520c",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-51871a",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-beaace",
  "org.scalablytyped" %%% "source-map" % "0.7.3-f4c7eb",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-d92267",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-0ca3a8",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20191230Z-daa3a0",
  "org.scalablytyped" %%% "webpack-blocks__assets" % "2.0-dt-20191016Z-a30a73",
  "org.scalablytyped" %%% "webpack-blocks__babel" % "2.0-dt-20191016Z-aea258",
  "org.scalablytyped" %%% "webpack-blocks__core" % "2.0-dt-20191016Z-f75857",
  "org.scalablytyped" %%% "webpack-blocks__dev-server" % "2.0-dt-20191016Z-4c2c7c",
  "org.scalablytyped" %%% "webpack-blocks__postcss" % "2.0-dt-20191016Z-dcaf06",
  "org.scalablytyped" %%% "webpack-blocks__sass" % "2.0-dt-20191016Z-6f9f30",
  "org.scalablytyped" %%% "webpack-blocks__typescript" % "2.0-dt-20191016Z-89d8ae",
  "org.scalablytyped" %%% "webpack-blocks__uglify" % "2.0-dt-20191016Z-6fcc43",
  "org.scalablytyped" %%% "webpack-blocks__webpack" % "2.0-dt-20191016Z-4e0299",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-f093f9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        