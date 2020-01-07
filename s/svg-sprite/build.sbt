organization := "org.scalablytyped"
name := "svg-sprite"
version := "0.0-unknown-dt-20190322Z-53e7be"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "logform" % "2.1.2-6aab8c",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-51871a",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20191106Z-2f6a4a",
  "org.scalablytyped" %%% "winston" % "3.2.1-1ce445",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-509448")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        