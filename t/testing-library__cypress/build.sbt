organization := "org.scalablytyped"
name := "testing-library__cypress"
version := "5.0-dt-20191024Z-7c35c2"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cypress" % "3.6.1-c794c4",
  "org.scalablytyped" %%% "pretty-format" % "24.9.0-681723",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-a5fece",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "testing-library__dom" % "6.10-dt-20191101Z-cdbe98")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        