organization := "org.scalablytyped"
name := "webcola"
version := "3.4.0-aaebd4"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-ed1552",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20190212Z-5902b8",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-c42062",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-8748cc",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        