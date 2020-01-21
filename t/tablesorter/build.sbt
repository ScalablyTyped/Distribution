organization := "org.scalablytyped"
name := "tablesorter"
version := "2.31-dt-20190521Z-8d525d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cldrjs" % "0.4.4-dt-20191126Z-957d1f",
  "org.scalablytyped" %%% "globalize" % "0.0-unknown-dt-20191207Z-fee6fb",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20191126Z-e499a9",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20191218Z-244759",
  "org.scalablytyped" %%% "requirejs" % "2.1.20-dt-20190322Z-c0c993",
  "org.scalablytyped" %%% "select2" % "4.0-dt-20190227Z-bfe9b4",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-8d2e4e",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        