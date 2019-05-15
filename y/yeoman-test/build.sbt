organization := "org.scalablytyped"
name := "yeoman-test"
version := "2.0-dt-20190317Z-9b9cca"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190514Z-383755",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190514Z-07594f",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-58c2b6",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-f06c03",
  "org.scalablytyped" %%% "yeoman-generator" % "3.1-dt-20190501Z-2eace5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        