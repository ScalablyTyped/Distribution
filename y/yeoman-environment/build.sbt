organization := "org.scalablytyped"
name := "yeoman-environment"
version := "2.3-dt-20190522Z-ee3652"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190522Z-a73a86",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-1a0120",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190717Z-f93e3e",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-c5f4a8",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-553c49",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-d2e3b4",
  "org.scalablytyped" %%% "yeoman-generator" % "3.1-dt-20190522Z-5e9051")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        