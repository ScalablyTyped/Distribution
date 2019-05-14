organization := "org.scalablytyped"
name := "yeoman-environment"
version := "2.3-dt-20190503Z-1b0eaf"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190424Z-d757a1",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-87e535",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190513Z-e9c6e7",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-58c2b6",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-646b87",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-bb35b5",
  "org.scalablytyped" %%% "yeoman-generator" % "3.1-dt-20190501Z-de19e3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        