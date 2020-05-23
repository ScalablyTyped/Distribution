organization := "org.scalablytyped"
name := "topojson"
version := "3.2-dt-20200515Z-1bef53"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20200515Z-0ec701",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "topojson-client" % "3.0-dt-20180414Z-cb9163",
  "org.scalablytyped" %%% "topojson-simplify" % "3.0-dt-20180414Z-0b6cab",
  "org.scalablytyped" %%% "topojson-specification" % "1.0-dt-20190213Z-e12321")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
