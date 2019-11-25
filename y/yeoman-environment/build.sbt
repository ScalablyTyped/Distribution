organization := "org.scalablytyped"
name := "yeoman-environment"
version := "2.3-dt-20190731Z-223ff2"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-c88e70",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-f8bafc",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-382692",
  "org.scalablytyped" %%% "rxjs" % "6.5.3-08a2c3",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-d4df82",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20191106Z-e0bd5f",
  "org.scalablytyped" %%% "yeoman-generator" % "3.1-dt-20190731Z-8d85cc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        