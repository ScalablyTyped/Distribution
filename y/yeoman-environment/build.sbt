organization := "org.scalablytyped"
name := "yeoman-environment"
version := "2.3-dt-20190731Z-88e259"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-79aec5",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-4bfe53",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191210Z-b5c359",
  "org.scalablytyped" %%% "rxjs" % "6.5.3-481954",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.3-99e1b6",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-a84da5",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20191106Z-256b7f",
  "org.scalablytyped" %%% "yeoman-generator" % "3.1-dt-20190731Z-841088")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        