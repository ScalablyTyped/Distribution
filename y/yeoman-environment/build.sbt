organization := "org.scalablytyped"
name := "yeoman-environment"
version := "2.3-dt-20190522Z-3bd41d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190522Z-d354e6",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-177405",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-2c614a",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-11b18b",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-a756cc",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-9bb514",
  "org.scalablytyped" %%% "yeoman-generator" % "3.1-dt-20190522Z-74512f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        