organization := "org.scalablytyped"
name := "yeoman-test"
version := "2.0-dt-20190522Z-5c6fba"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190522Z-27e2e4",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190606Z-b7fe68",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-11b18b",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-ece5fa",
  "org.scalablytyped" %%% "yeoman-generator" % "3.1-dt-20190522Z-92edd7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        