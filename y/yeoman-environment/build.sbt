organization := "org.scalablytyped"
name := "yeoman-environment"
version := "2.3-dt-20190503Z-eefd25"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190424Z-fc1959",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-348be7",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190502Z-84ec9f",
  "org.scalablytyped" %%% "rxjs" % "6.5.1-58c2b6",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-21358e",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-7718d6",
  "org.scalablytyped" %%% "yeoman-generator" % "3.1-dt-20190501Z-ce7799")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        