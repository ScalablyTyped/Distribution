organization := "org.scalablytyped"
name := "yeoman-environment"
version := "2.3-dt-20190731Z-2b63dd"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-23334c",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-117a02",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191023Z-ebe9d8",
  "org.scalablytyped" %%% "rxjs" % "6.5.3-06bc12",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-208f9c",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-e85074",
  "org.scalablytyped" %%% "yeoman-generator" % "3.1-dt-20190731Z-54a4e1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        