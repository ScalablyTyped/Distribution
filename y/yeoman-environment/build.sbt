organization := "org.scalablytyped"
name := "yeoman-environment"
version := "2.3-dt-20190731Z-4c5382"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-68b969",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-b438fb",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "rxjs" % "6.5.4-64cd03",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.4-d6ecc6",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-bf0667",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20191106Z-bb6f47",
  "org.scalablytyped" %%% "yeoman-generator" % "3.1-dt-20190731Z-e4de53")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        