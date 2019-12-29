organization := "org.scalablytyped"
name := "topojson-server"
version := "3.0-dt-20190326Z-cf6f3f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190925Z-9d9bfd",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "topojson-specification" % "1.0-dt-20190213Z-5dba1a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        