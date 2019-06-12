organization := "org.scalablytyped"
name := "yeoman-environment"
version := "2.3-dt-20190522Z-5146ea"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190522Z-3b698e",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-dded53",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-76ef23",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-69bca3",
  "org.scalablytyped" %%% "std" % "3.5-c5d119",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-534f45",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-fc6086",
  "org.scalablytyped" %%% "yeoman-generator" % "3.1-dt-20190522Z-b60cd4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        