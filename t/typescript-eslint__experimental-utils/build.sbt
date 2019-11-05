organization := "org.scalablytyped"
name := "typescript-eslint__experimental-utils"
version := "2.6.1-f46c44"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190717Z-94fac0",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "typescript" % "3.6.4-42c38b",
  "org.scalablytyped" %%% "typescript-eslint__typescript-estree" % "2.6.1-b2352e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        