organization := "org.scalablytyped"
name := "tablesorter"
version := "2.31-dt-20190521Z-dde19b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cldrjs" % "0.4.4-dt-20191126Z-692e1c",
  "org.scalablytyped" %%% "globalize" % "0.0-unknown-dt-20191207Z-dc94b4",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20191126Z-13d8c2",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20191218Z-0212fc",
  "org.scalablytyped" %%% "requirejs" % "2.1.20-dt-20190322Z-cd7e93",
  "org.scalablytyped" %%% "select2" % "4.0-dt-20190227Z-f48dab",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-95a8d0",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        