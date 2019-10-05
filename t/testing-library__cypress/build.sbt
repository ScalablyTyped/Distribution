organization := "org.scalablytyped"
name := "testing-library__cypress"
version := "5.0-dt-20190916Z-d403ee"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190815Z-f791ad",
  "org.scalablytyped" %%% "pretty-format" % "24.9.0-53a7e6",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-77de40",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "testing-library__dom" % "6.5-dt-20191003Z-516265")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        