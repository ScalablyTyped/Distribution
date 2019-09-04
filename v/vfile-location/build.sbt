organization := "org.scalablytyped"
name := "vfile-location"
version := "2.0-dt-20181127Z-0b4696"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190903Z-da4655",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20190213Z-707c90",
  "org.scalablytyped" %%% "vfile" % "3.0-dt-20181205Z-e0f8c0",
  "org.scalablytyped" %%% "vfile-message" % "1.0-dt-20181205Z-b1dada")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        