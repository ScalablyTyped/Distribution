organization := "org.scalablytyped"
name := "tablesorter"
version := "2.31-dt-20190521Z-ac38d5"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cldrjs" % "0.4.4-dt-20191126Z-86062e",
  "org.scalablytyped" %%% "globalize" % "0.0-unknown-dt-20191126Z-4612c2",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20191126Z-72186b",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20191104Z-3f50b3",
  "org.scalablytyped" %%% "requirejs" % "2.1.20-dt-20190322Z-71e656",
  "org.scalablytyped" %%% "select2" % "4.0-dt-20190227Z-ed3694",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-2d253b",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        