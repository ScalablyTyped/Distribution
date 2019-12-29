organization := "org.scalablytyped"
name := "subleveldown"
version := "4.1-dt-20191226Z-4fcffc"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "abstract-leveldown" % "5.0-dt-20180913Z-cd730b",
  "org.scalablytyped" %%% "level-codec" % "9.0-dt-20180828Z-9e364d",
  "org.scalablytyped" %%% "levelup" % "4.3-dt-20191206Z-955e93",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        