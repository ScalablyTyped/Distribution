organization := "org.scalablytyped"
name := "tensorflow__tfjs"
version := "1.3.0-784754"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "tensorflow__tfjs-converter" % "1.3.0-795586",
  "org.scalablytyped" %%% "tensorflow__tfjs-core" % "1.3.0-1e87e5",
  "org.scalablytyped" %%% "tensorflow__tfjs-data" % "1.3.0-d81cd7",
  "org.scalablytyped" %%% "tensorflow__tfjs-layers" % "1.3.0-bbb08e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        