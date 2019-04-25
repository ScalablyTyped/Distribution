organization := "org.scalablytyped"
name := "yeoman-generator"
version := "3.1-dt-20190317Z-8f2019"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190424Z-a41db4",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190422Z-40afee",
  "org.scalablytyped" %%% "rxjs" % "6.5.1-830250",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-a642de")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        