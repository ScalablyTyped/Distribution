organization := "org.scalablytyped"
name := "yeoman-environment"
version := "2.3-dt-20190731Z-182248"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-8fcfc4",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-208a43",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-e91184",
  "org.scalablytyped" %%% "rxjs" % "6.5.3-9938ed",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-410ad9",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-788ddb",
  "org.scalablytyped" %%% "yeoman-generator" % "3.1-dt-20190731Z-1e5811")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        