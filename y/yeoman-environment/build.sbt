organization := "org.scalablytyped"
name := "yeoman-environment"
version := "2.3-dt-20190522Z-a59f64"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190522Z-db1aed",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-10e040",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-b8909f",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-990046",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-d1d8ae",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-459738",
  "org.scalablytyped" %%% "yeoman-generator" % "3.1-dt-20190522Z-bda001")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        