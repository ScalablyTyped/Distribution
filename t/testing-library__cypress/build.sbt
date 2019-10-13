organization := "org.scalablytyped"
name := "testing-library__cypress"
version := "5.0-dt-20190916Z-2fc3bd"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190815Z-4b5800",
  "org.scalablytyped" %%% "pretty-format" % "24.9.0-defaef",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-8ec6f6",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "testing-library__dom" % "6.5-dt-20191010Z-bfe369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        