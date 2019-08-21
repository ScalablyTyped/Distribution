organization := "org.scalablytyped"
name := "yeoman-environment"
version := "2.3-dt-20190731Z-dadeb1"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-443218",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-1d8d05",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-2dc4df",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-1ca89d",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-600ed2",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-4f074e",
  "org.scalablytyped" %%% "yeoman-generator" % "3.1-dt-20190731Z-1e2453")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        