organization := "org.scalablytyped"
name := "topojson"
version := "3.2-dt-20190717Z-7de574"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-2af848",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "topojson-client" % "3.0-dt-20180414Z-83f725",
  "org.scalablytyped" %%% "topojson-simplify" % "3.0-dt-20180414Z-174be9",
  "org.scalablytyped" %%% "topojson-specification" % "1.0-dt-20190213Z-ecb67b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        