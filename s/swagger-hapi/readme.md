
# Scala.js typings for swagger-hapi

Typings are for version 0.7

## Library description:
Swagger loader and middleware for Hapi

|                    |                 |
| ------------------ | :-------------: |
| Full name          | swagger-hapi |
| Keywords           | swagger, api, apis, hapi |
| # releases         | 0 |
| # dependents       | 0 |
| # downloads        | 6807 |
| # stars            | 0 |

## Links
- [Homepage](https://github.com/apigee-127/swagger-hapi#readme)
- [Bugs](https://github.com/apigee-127/swagger-hapi/issues)
- [Repository](https://github.com/apigee-127/swagger-hapi)
- [Npm](https://www.npmjs.com/package/swagger-hapi)
    


## Note
This library has been generated from typescript code from [DefinitelyTyped](https://definitelytyped.org).

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
// Type definitions for swagger-hapi 0.7
// Project: https://github.com/apigee-127/swagger-hapi#readme
// Definitions by: Michael Mrowetz <https://github.com/micmro>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 2.8
/* =================== USAGE ===================

import * as SwaggerHapi from "swagger-hapi";
import * as Hapi from "hapi";

var app = new Hapi.Server();
let config: SwaggerHapi.Config = {
    appRoot: __dirname
};

SwaggerHapi.create(config, (err, middleware) => {
    if (err) {
        throw err; // or handle error
    }
    var port = process.env.PORT || 10010;
    app.connection({ port });

    app.register(middleware.plugin, function(err) {
        if (err) { return console.error("Failed to load plugin:", err); }
        app.start(function() {
            if (middleware.runner.swagger.paths['/hello']) {
                console.log('try this:\ncurl http://127.0.0.1:' + port + '/hello?name=Scott');
            }
        });
    });
});

 =============================================== */


```

